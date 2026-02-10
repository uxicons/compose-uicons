package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gun: ImageVector? = null

val Icons.Ts.Gun: ImageVector
    get() = _Gun ?: UXIcon(name = "Gun") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(21f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                lineTo(2f, 2f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(0f, 4f)
                verticalLineToRelative(5f)
                lineTo(0.5f, 9f)
                curveToRelative(1.76f, 0.02f, 2.91f, 0.77f, 2.41f, 2.49f)
                lineTo(0.02f, 20.85f)
                lineToRelative(-0.02f, 1.15f)
                lineTo(6.57f, 22f)
                lineToRelative(2.45f, -8f)
                horizontalLineToRelative(3.45f)
                curveToRelative(1.56f, 0f, 2.9f, -1.0f, 3.35f, -2.5f)
                lineToRelative(0.75f, -2.5f)
                horizontalLineToRelative(4.74f)
                lineToRelative(1f, -2f)
                horizontalLineToRelative(1.69f)
                verticalLineToRelative(-3f)
                close()
                moveTo(5.83f, 21f)
                lineTo(1.02f, 21f)
                lineTo(3.87f, 11.78f)
                curveToRelative(0.37f, -1.46f, 0.03f, -2.15f, -0.51f, -2.78f)
                horizontalLineToRelative(6.14f)
                lineToRelative(-3.67f, 12f)
                close()
                moveTo(14.86f, 11.22f)
                curveToRelative(-0.32f, 1.07f, -1.28f, 1.78f, -2.4f, 1.78f)
                horizontalLineToRelative(-3.15f)
                lineToRelative(0.61f, -2f)
                horizontalLineToRelative(1.82f)
                curveToRelative(0.67f, 0f, 1.25f, -0.43f, 1.44f, -1.07f)
                lineToRelative(0.28f, -0.93f)
                horizontalLineToRelative(2.06f)
                lineToRelative(-0.67f, 2.22f)
                close()
                moveTo(10.24f, 10f)
                lineToRelative(0.31f, -1f)
                horizontalLineToRelative(1.88f)
                lineToRelative(-0.19f, 0.64f)
                curveToRelative(-0.06f, 0.21f, -0.26f, 0.36f, -0.48f, 0.36f)
                horizontalLineToRelative(-1.52f)
                close()
                moveTo(20.69f, 8f)
                lineTo(1f, 8f)
                verticalLineToRelative(-3.05f)
                curveToRelative(0.98f, -0.2f, 1.75f, -0.97f, 1.95f, -1.95f)
                lineTo(22f, 3f)
                verticalLineToRelative(2f)
                lineTo(4f, 5f)
                verticalLineToRelative(1f)
                lineTo(21.69f, 6f)
                lineToRelative(-1f, 2f)
                close()
            }
        }.also { _Gun = it}
