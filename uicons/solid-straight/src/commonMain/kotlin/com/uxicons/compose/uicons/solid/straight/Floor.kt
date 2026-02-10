package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Floor: ImageVector? = null

val Icons.Ss.Floor: ImageVector
    get() = _Floor ?: UXIcon(name = "Floor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.38f, 12.06f)
                lineToRelative(-2.77f, -1.71f)
                lineToRelative(5.1f, -3.13f)
                lineToRelative(2.78f, 1.71f)
                lineToRelative(-5.11f, 3.14f)
                close()
                moveTo(2.53f, 5.93f)
                lineTo(-0.02f, 7.5f)
                lineToRelative(2.71f, 1.68f)
                lineToRelative(2.56f, -1.57f)
                lineToRelative(-2.73f, -1.68f)
                close()
                moveTo(16.65f, 2.95f)
                lineToRelative(-5.04f, 3.1f)
                lineToRelative(2.78f, 1.71f)
                lineToRelative(5.03f, -3.09f)
                lineToRelative(-2.77f, -1.71f)
                close()
                moveTo(24.02f, 7.5f)
                lineToRelative(-2.68f, -1.66f)
                lineToRelative(-2.56f, 1.57f)
                lineToRelative(2.7f, 1.66f)
                lineToRelative(2.55f, -1.57f)
                close()
                moveTo(16.86f, 8.59f)
                lineToRelative(-7.58f, 4.65f)
                lineToRelative(2.72f, 1.68f)
                lineToRelative(7.56f, -4.67f)
                lineToRelative(-2.71f, -1.66f)
                close()
                moveTo(7.17f, 6.43f)
                lineTo(14.75f, 1.77f)
                lineTo(12f, 0.07f)
                lineToRelative(-7.57f, 4.67f)
                lineToRelative(2.73f, 1.68f)
                close()
                moveTo(0f, 9.66f)
                verticalLineToRelative(2.35f)
                lineToRelative(12f, 7.41f)
                lineToRelative(12f, -7.41f)
                verticalLineToRelative(-2.35f)
                lineToRelative(-12f, 7.41f)
                lineTo(0f, 9.66f)
                close()
                moveTo(0f, 14.16f)
                verticalLineToRelative(2.35f)
                lineToRelative(12f, 7.41f)
                lineToRelative(12f, -7.41f)
                verticalLineToRelative(-2.35f)
                lineToRelative(-12f, 7.41f)
                lineTo(0f, 14.16f)
                close()
            }
        }.also { _Floor = it}
