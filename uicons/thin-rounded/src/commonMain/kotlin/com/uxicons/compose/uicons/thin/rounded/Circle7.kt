package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Circle7: ImageVector? = null

val Icons.Tr.Circle7: ImageVector
    get() = _Circle7 ?: UXIcon(name = "Circle7") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                close()
                moveTo(9.92f, 17.77f)
                lineToRelative(5.9f, -9.35f)
                curveToRelative(0.26f, -0.52f, 0.23f, -1.13f, -0.07f, -1.62f)
                curveToRelative(-0.31f, -0.49f, -0.84f, -0.79f, -1.42f, -0.79f)
                horizontalLineToRelative(-5.83f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(5.83f)
                curveToRelative(0.24f, 0f, 0.44f, 0.12f, 0.57f, 0.32f)
                curveToRelative(0.12f, 0.2f, 0.14f, 0.44f, 0.05f, 0.61f)
                lineToRelative(-5.88f, 9.31f)
                curveToRelative(-0.15f, 0.23f, -0.08f, 0.54f, 0.16f, 0.69f)
                curveToRelative(0.08f, 0.05f, 0.17f, 0.08f, 0.27f, 0.08f)
                curveToRelative(0.17f, 0f, 0.33f, -0.08f, 0.42f, -0.23f)
                close()
            }
        }.also { _Circle7 = it}
