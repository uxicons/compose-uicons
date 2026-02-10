package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ModelCubeSpace: ImageVector? = null

val Icons.Bs.ModelCubeSpace: ImageVector
    get() = _ModelCubeSpace ?: UXIcon(name = "ModelCubeSpace") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10.85f)
                lineToRelative(-4.0f, -2.29f)
                lineToRelative(4.0f, -2.29f)
                lineToRelative(4.0f, 2.29f)
                lineToRelative(-4.0f, 2.29f)
                close()
                moveTo(7f, 10.29f)
                verticalLineToRelative(4.58f)
                lineToRelative(4f, 2.29f)
                verticalLineToRelative(-4.58f)
                lineToRelative(-4f, -2.29f)
                close()
                moveTo(17f, 10.29f)
                lineToRelative(-4f, 2.29f)
                verticalLineToRelative(4.58f)
                lineToRelative(4f, -2.29f)
                verticalLineToRelative(-4.58f)
                close()
                moveTo(22.5f, 5.99f)
                verticalLineToRelative(12.03f)
                lineToRelative(-10.5f, 6.0f)
                lineTo(1.5f, 18.01f)
                lineTo(1.5f, 5.99f)
                lineTo(12f, -0.01f)
                lineToRelative(10.5f, 6.0f)
                close()
                moveTo(19.5f, 16.27f)
                verticalLineToRelative(-7.41f)
                lineToRelative(-2.5f, 1.43f)
                verticalLineToRelative(-1.17f)
                lineToRelative(-1.0f, -0.57f)
                lineToRelative(2.48f, -1.42f)
                lineToRelative(-6.48f, -3.7f)
                lineToRelative(-6.48f, 3.7f)
                lineToRelative(2.48f, 1.42f)
                lineToRelative(-1.0f, 0.57f)
                verticalLineToRelative(1.17f)
                lineToRelative(-2.5f, -1.43f)
                verticalLineToRelative(7.41f)
                lineToRelative(6.5f, 3.71f)
                verticalLineToRelative(-2.83f)
                lineToRelative(1f, 0.57f)
                lineToRelative(1f, -0.57f)
                verticalLineToRelative(2.83f)
                lineToRelative(6.5f, -3.71f)
                close()
            }
        }.also { _ModelCubeSpace = it}
