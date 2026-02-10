package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ModelCubeSpace: ImageVector? = null

val Icons.Ss.ModelCubeSpace: ImageVector
    get() = _ModelCubeSpace ?: UXIcon(name = "ModelCubeSpace") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 16.0f)
                lineToRelative(-3f, -1.72f)
                verticalLineToRelative(-3.42f)
                lineToRelative(3f, 1.71f)
                verticalLineToRelative(3.42f)
                close()
                moveTo(16f, 10.87f)
                lineToRelative(-3f, 1.71f)
                verticalLineToRelative(3.42f)
                lineToRelative(3f, -1.72f)
                verticalLineToRelative(-3.42f)
                close()
                moveTo(7.0f, 7.99f)
                lineToRelative(5.0f, -2.87f)
                lineToRelative(5.0f, 2.87f)
                lineToRelative(4.5f, -2.57f)
                lineTo(12f, -0.01f)
                lineTo(2.5f, 5.42f)
                lineToRelative(4.5f, 2.57f)
                close()
                moveTo(18f, 9.72f)
                verticalLineToRelative(5.73f)
                lineToRelative(-5f, 2.86f)
                verticalLineToRelative(5.13f)
                lineToRelative(9.5f, -5.43f)
                lineTo(22.5f, 7.15f)
                lineToRelative(-4.5f, 2.57f)
                close()
                moveTo(11f, 18.31f)
                lineToRelative(-5f, -2.86f)
                verticalLineToRelative(-5.73f)
                lineTo(1.5f, 7.15f)
                verticalLineToRelative(10.86f)
                lineToRelative(9.5f, 5.43f)
                verticalLineToRelative(-5.13f)
                close()
                moveTo(9.01f, 9.14f)
                lineToRelative(2.99f, 1.71f)
                lineToRelative(2.99f, -1.71f)
                lineToRelative(-2.99f, -1.72f)
                lineToRelative(-2.99f, 1.72f)
                close()
            }
        }.also { _ModelCubeSpace = it}
