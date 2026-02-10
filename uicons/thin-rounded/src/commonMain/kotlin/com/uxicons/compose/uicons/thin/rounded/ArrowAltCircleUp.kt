package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltCircleUp: ImageVector? = null

val Icons.Tr.ArrowAltCircleUp: ImageVector
    get() = _ArrowAltCircleUp ?: UXIcon(name = "ArrowAltCircleUp") {
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
                moveTo(12.91f, 5.38f)
                curveToRelative(-0.48f, -0.49f, -1.33f, -0.49f, -1.82f, 0f)
                lineToRelative(-4.36f, 4.42f)
                curveToRelative(-0.37f, 0.37f, -0.47f, 0.93f, -0.27f, 1.41f)
                curveToRelative(0.2f, 0.49f, 0.66f, 0.79f, 1.18f, 0.79f)
                horizontalLineToRelative(3.86f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(3.86f)
                curveToRelative(0.52f, 0f, 0.98f, -0.3f, 1.18f, -0.79f)
                curveToRelative(0.2f, -0.48f, 0.1f, -1.04f, -0.27f, -1.41f)
                lineToRelative(-4.36f, -4.42f)
                close()
                moveTo(16.62f, 10.82f)
                curveToRelative(-0.02f, 0.05f, -0.09f, 0.17f, -0.26f, 0.17f)
                lineTo(7.64f, 11f)
                curveToRelative(-0.17f, 0f, -0.23f, -0.12f, -0.26f, -0.17f)
                curveToRelative(-0.02f, -0.06f, -0.06f, -0.2f, 0.06f, -0.32f)
                lineToRelative(4.36f, -4.42f)
                curveToRelative(0.05f, -0.05f, 0.12f, -0.08f, 0.2f, -0.08f)
                reflectiveCurveToRelative(0.14f, 0.03f, 0.2f, 0.08f)
                lineToRelative(4.36f, 4.42f)
                curveToRelative(0.12f, 0.13f, 0.08f, 0.27f, 0.06f, 0.32f)
                close()
            }
        }.also { _ArrowAltCircleUp = it}
