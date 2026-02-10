package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gun: ImageVector? = null

val Icons.Bs.Gun: ImageVector
    get() = _Gun ?: UXIcon(name = "Gun") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4.5f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 2f)
                lineTo(2f, 2f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(0f, 4f)
                verticalLineToRelative(6.01f)
                lineToRelative(1.53f, -0.01f)
                curveToRelative(0.75f, 0.12f, 1.01f, 0.46f, 0.91f, 1.23f)
                lineTo(0f, 19.79f)
                verticalLineToRelative(2.21f)
                lineTo(7.83f, 22f)
                lineToRelative(1.71f, -6f)
                horizontalLineToRelative(3.29f)
                curveToRelative(1.78f, 0f, 3.32f, -1.15f, 3.83f, -2.85f)
                lineToRelative(0.94f, -3.15f)
                horizontalLineToRelative(5.38f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                close()
                moveTo(5.57f, 19f)
                lineTo(3.35f, 19f)
                lineToRelative(1.99f, -6.95f)
                curveToRelative(0.2f, -0.69f, 0.2f, -1.39f, 0.04f, -2.05f)
                horizontalLineToRelative(2.77f)
                lineToRelative(-2.57f, 9f)
                close()
                moveTo(13.8f, 12.29f)
                curveToRelative(-0.12f, 0.42f, -0.52f, 0.71f, -0.96f, 0.71f)
                horizontalLineToRelative(-2.44f)
                lineToRelative(0.86f, -3f)
                horizontalLineToRelative(3.22f)
                lineToRelative(-0.69f, 2.29f)
                close()
                moveTo(20.0f, 7f)
                lineTo(3f, 7f)
                verticalLineToRelative(-0.34f)
                curveToRelative(0.73f, -0.35f, 1.32f, -0.94f, 1.66f, -1.66f)
                horizontalLineToRelative(15.34f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Gun = it}
