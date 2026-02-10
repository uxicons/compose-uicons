package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InsertButtonCircle: ImageVector? = null

val Icons.Tr.InsertButtonCircle: ImageVector
    get() = _InsertButtonCircle ?: UXIcon(name = "InsertButtonCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(15.5f, 7f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(15.5f, 9f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                close()
                moveTo(15.5f, 11f)
                horizontalLineToRelative(-7.01f)
                curveToRelative(-0.57f, 0f, -1.08f, 0.32f, -1.33f, 0.82f)
                curveToRelative(-0.26f, 0.51f, -0.2f, 1.11f, 0.15f, 1.58f)
                lineToRelative(3.49f, 4.3f)
                curveToRelative(0.28f, 0.38f, 0.72f, 0.6f, 1.2f, 0.6f)
                horizontalLineToRelative(0f)
                curveToRelative(0.48f, 0f, 0.92f, -0.22f, 1.19f, -0.59f)
                lineToRelative(3.52f, -4.33f)
                curveToRelative(0.34f, -0.46f, 0.39f, -1.05f, 0.14f, -1.56f)
                curveToRelative(-0.26f, -0.51f, -0.77f, -0.82f, -1.33f, -0.82f)
                close()
                moveTo(15.91f, 12.77f)
                lineToRelative(-3.52f, 4.33f)
                curveToRelative(-0.19f, 0.25f, -0.59f, 0.27f, -0.81f, -0.02f)
                lineToRelative(-3.49f, -4.3f)
                curveToRelative(-0.11f, -0.15f, -0.13f, -0.35f, -0.04f, -0.52f)
                reflectiveCurveToRelative(0.25f, -0.27f, 0.44f, -0.27f)
                horizontalLineToRelative(7.01f)
                curveToRelative(0.19f, 0f, 0.35f, 0.1f, 0.44f, 0.27f)
                reflectiveCurveToRelative(0.07f, 0.36f, -0.03f, 0.5f)
                close()
            }
        }.also { _InsertButtonCircle = it}
