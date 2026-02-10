package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vihara: ImageVector? = null

val Icons.Sr.Vihara: ImageVector
    get() = _Vihara ?: UXIcon(name = "Vihara") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                lineTo(4f, 12f)
                close()
                moveTo(2f, 22.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-2f)
                lineTo(2f, 22f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(3.02f, 8f)
                horizontalLineToRelative(17.96f)
                curveToRelative(0.56f, 0f, 1.02f, -0.44f, 1.02f, -1f)
                curveToRelative(0f, -0.49f, -0.35f, -0.98f, -0.82f, -1.11f)
                curveToRelative(-2.04f, -0.56f, -3.0f, -3.06f, -3.01f, -3.1f)
                lineToRelative(-0.17f, -0.77f)
                verticalLineToRelative(-1.02f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-8f)
                reflectiveCurveToRelative(0f, -1f, 0f, -1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.02f)
                lineToRelative(-0.17f, 0.77f)
                curveToRelative(-0.01f, 0.05f, -0.97f, 2.55f, -3.01f, 3.1f)
                curveToRelative(-0.47f, 0.13f, -0.82f, 0.62f, -0.82f, 1.11f)
                curveToRelative(0f, 0.56f, 0.46f, 1f, 1.02f, 1f)
                close()
                moveTo(9f, 24f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                close()
                moveTo(23.21f, 17.89f)
                curveToRelative(-1.76f, -0.51f, -2.92f, -2.62f, -3.21f, -3.89f)
                lineTo(4f, 14f)
                curveToRelative(-0.26f, 1.19f, -1.45f, 3.36f, -3.21f, 3.89f)
                curveToRelative(-0.45f, 0.13f, -0.79f, 0.65f, -0.79f, 1.11f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1.0f, 1f)
                horizontalLineToRelative(21.99f)
                curveToRelative(0.55f, 0f, 1.0f, -0.45f, 1.0f, -1f)
                curveToRelative(0f, -0.47f, -0.34f, -0.98f, -0.79f, -1.11f)
                close()
                moveTo(17f, 24f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Vihara = it}
