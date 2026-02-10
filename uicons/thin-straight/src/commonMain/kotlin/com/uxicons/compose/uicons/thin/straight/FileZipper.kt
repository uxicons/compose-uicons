package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileZipper: ImageVector? = null

val Icons.Ts.FileZipper: ImageVector
    get() = _FileZipper ?: UXIcon(name = "FileZipper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                close()
                moveTo(8f, 5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                close()
                moveTo(8f, 8f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                close()
                moveTo(8.06f, 11f)
                lineToRelative(1.44f, 5.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-4f)
                lineToRelative(0.02f, -1.63f)
                lineToRelative(1.45f, -5.37f)
                horizontalLineToRelative(1.09f)
                close()
                moveTo(8.5f, 16.57f)
                lineToRelative(-0.99f, -3.73f)
                lineToRelative(-1.01f, 3.74f)
                verticalLineToRelative(0.43f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.43f)
                close()
                moveTo(22f, 7.29f)
                verticalLineToRelative(16.71f)
                lineTo(2f, 24f)
                lineTo(2f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(10.21f)
                lineToRelative(7.29f, 7.29f)
                close()
                moveTo(15f, 7f)
                horizontalLineToRelative(5.29f)
                lineTo(15f, 1.71f)
                verticalLineToRelative(5.29f)
                close()
                moveTo(21f, 23f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(-7f)
                lineTo(14f, 1f)
                lineTo(4.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(18f)
                close()
            }
        }.also { _FileZipper = it}
