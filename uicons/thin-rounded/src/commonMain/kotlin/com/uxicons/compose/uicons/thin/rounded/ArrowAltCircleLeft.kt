package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltCircleLeft: ImageVector? = null

val Icons.Tr.ArrowAltCircleLeft: ImageVector
    get() = _ArrowAltCircleLeft ?: UXIcon(name = "ArrowAltCircleLeft") {
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
                moveTo(18.5f, 11.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-3.86f)
                curveToRelative(0f, -0.52f, -0.3f, -0.98f, -0.79f, -1.18f)
                curveToRelative(-0.48f, -0.2f, -1.04f, -0.1f, -1.41f, 0.27f)
                lineToRelative(-4.42f, 4.36f)
                curveToRelative(-0.24f, 0.24f, -0.38f, 0.56f, -0.38f, 0.91f)
                reflectiveCurveToRelative(0.14f, 0.67f, 0.38f, 0.91f)
                lineToRelative(4.42f, 4.36f)
                curveToRelative(0.25f, 0.24f, 0.57f, 0.37f, 0.91f, 0.37f)
                curveToRelative(0.17f, 0f, 0.34f, -0.03f, 0.5f, -0.1f)
                curveToRelative(0.49f, -0.2f, 0.79f, -0.66f, 0.79f, -1.18f)
                verticalLineToRelative(-3.86f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(11f, 16.36f)
                curveToRelative(0f, 0.17f, -0.12f, 0.23f, -0.17f, 0.26f)
                curveToRelative(-0.06f, 0.02f, -0.2f, 0.06f, -0.32f, -0.06f)
                lineToRelative(-4.42f, -4.36f)
                curveToRelative(-0.05f, -0.05f, -0.08f, -0.12f, -0.08f, -0.2f)
                reflectiveCurveToRelative(0.03f, -0.14f, 0.08f, -0.2f)
                lineToRelative(4.42f, -4.36f)
                curveToRelative(0.07f, -0.07f, 0.14f, -0.09f, 0.2f, -0.09f)
                curveToRelative(0.05f, 0f, 0.1f, 0.01f, 0.12f, 0.03f)
                curveToRelative(0.05f, 0.02f, 0.17f, 0.09f, 0.17f, 0.26f)
                verticalLineToRelative(8.72f)
                close()
            }
        }.also { _ArrowAltCircleLeft = it}
