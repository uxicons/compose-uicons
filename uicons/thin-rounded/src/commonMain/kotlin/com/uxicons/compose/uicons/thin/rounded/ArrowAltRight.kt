package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltRight: ImageVector? = null

val Icons.Tr.ArrowAltRight: ImageVector
    get() = _ArrowAltRight ?: UXIcon(name = "ArrowAltRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.62f, 11.09f)
                lineToRelative(-4.42f, -4.36f)
                curveToRelative(-0.37f, -0.37f, -0.93f, -0.48f, -1.41f, -0.27f)
                curveToRelative(-0.49f, 0.2f, -0.79f, 0.66f, -0.79f, 1.18f)
                verticalLineToRelative(3.86f)
                lineTo(0.5f, 11.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                lineTo(17f, 12.5f)
                verticalLineToRelative(3.86f)
                curveToRelative(0f, 0.52f, 0.3f, 0.98f, 0.79f, 1.18f)
                curveToRelative(0.16f, 0.07f, 0.33f, 0.1f, 0.5f, 0.1f)
                curveToRelative(0.33f, 0f, 0.66f, -0.13f, 0.91f, -0.37f)
                lineToRelative(4.42f, -4.36f)
                curveToRelative(0.24f, -0.24f, 0.38f, -0.56f, 0.38f, -0.91f)
                reflectiveCurveToRelative(-0.14f, -0.67f, -0.38f, -0.91f)
                close()
                moveTo(22.92f, 12.2f)
                lineToRelative(-4.42f, 4.36f)
                curveToRelative(-0.13f, 0.12f, -0.27f, 0.08f, -0.33f, 0.06f)
                curveToRelative(-0.05f, -0.02f, -0.17f, -0.09f, -0.17f, -0.26f)
                lineTo(18f, 7.64f)
                curveToRelative(0f, -0.17f, 0.12f, -0.23f, 0.17f, -0.26f)
                curveToRelative(0.03f, -0.01f, 0.07f, -0.03f, 0.12f, -0.03f)
                curveToRelative(0.06f, 0f, 0.13f, 0.02f, 0.2f, 0.09f)
                lineToRelative(4.42f, 4.36f)
                curveToRelative(0.05f, 0.05f, 0.08f, 0.12f, 0.08f, 0.2f)
                reflectiveCurveToRelative(-0.03f, 0.14f, -0.08f, 0.2f)
                close()
            }
        }.also { _ArrowAltRight = it}
