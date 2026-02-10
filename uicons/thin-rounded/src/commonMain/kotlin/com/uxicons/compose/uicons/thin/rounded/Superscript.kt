package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Superscript: ImageVector? = null

val Icons.Tr.Superscript: ImageVector
    get() = _Superscript ?: UXIcon(name = "Superscript") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0.5f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(23f, 1.71f)
                lineToRelative(-2.15f, 2.15f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, -0.51f, 0f, -0.71f)
                lineTo(23.15f, 0.15f)
                curveToRelative(0.14f, -0.14f, 0.36f, -0.18f, 0.55f, -0.11f)
                curveToRelative(0.19f, 0.08f, 0.31f, 0.26f, 0.31f, 0.46f)
                close()
                moveTo(14.82f, 6.11f)
                curveToRelative(-0.21f, -0.18f, -0.53f, -0.14f, -0.7f, 0.07f)
                lineToRelative(-6.61f, 8.03f)
                lineTo(0.89f, 6.18f)
                curveToRelative(-0.17f, -0.21f, -0.49f, -0.24f, -0.7f, -0.07f)
                curveToRelative(-0.21f, 0.18f, -0.24f, 0.49f, -0.07f, 0.7f)
                lineToRelative(6.74f, 8.18f)
                lineTo(0.11f, 23.18f)
                curveToRelative(-0.18f, 0.21f, -0.15f, 0.53f, 0.07f, 0.7f)
                curveToRelative(0.09f, 0.08f, 0.21f, 0.11f, 0.32f, 0.11f)
                curveToRelative(0.14f, 0f, 0.29f, -0.06f, 0.39f, -0.18f)
                lineToRelative(6.61f, -8.03f)
                lineToRelative(6.61f, 8.03f)
                curveToRelative(0.1f, 0.12f, 0.24f, 0.18f, 0.39f, 0.18f)
                curveToRelative(0.11f, 0f, 0.22f, -0.04f, 0.32f, -0.11f)
                curveToRelative(0.21f, -0.18f, 0.24f, -0.49f, 0.07f, -0.7f)
                lineToRelative(-6.74f, -8.18f)
                lineToRelative(6.74f, -8.18f)
                curveToRelative(0.18f, -0.21f, 0.15f, -0.53f, -0.07f, -0.7f)
                close()
            }
        }.also { _Superscript = it}
