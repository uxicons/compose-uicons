package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ModelCubeSpace: ImageVector? = null

val Icons.Rs.ModelCubeSpace: ImageVector
    get() = _ModelCubeSpace ?: UXIcon(name = "ModelCubeSpace") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, -0.01f)
                lineTo(1.5f, 5.99f)
                verticalLineToRelative(12.02f)
                lineToRelative(10.5f, 6f)
                lineToRelative(10.5f, -6f)
                lineTo(22.5f, 5.99f)
                lineTo(12f, -0.01f)
                close()
                moveTo(19.48f, 6.57f)
                lineToRelative(-2.48f, 1.42f)
                lineToRelative(-5.0f, -2.87f)
                lineToRelative(-5.0f, 2.87f)
                lineToRelative(-2.48f, -1.42f)
                lineToRelative(7.49f, -4.28f)
                lineToRelative(7.49f, 4.28f)
                close()
                moveTo(8f, 10.87f)
                lineToRelative(3f, 1.71f)
                verticalLineToRelative(3.42f)
                lineToRelative(-3f, -1.72f)
                verticalLineToRelative(-3.42f)
                close()
                moveTo(13f, 12.58f)
                lineToRelative(3f, -1.71f)
                verticalLineToRelative(3.42f)
                lineToRelative(-3f, 1.72f)
                verticalLineToRelative(-3.42f)
                close()
                moveTo(12f, 10.85f)
                lineToRelative(-2.99f, -1.71f)
                lineToRelative(2.99f, -1.72f)
                lineToRelative(2.99f, 1.72f)
                lineToRelative(-2.99f, 1.71f)
                close()
                moveTo(3.5f, 8.29f)
                lineToRelative(2.5f, 1.43f)
                verticalLineToRelative(5.73f)
                lineToRelative(5f, 2.86f)
                verticalLineToRelative(2.83f)
                lineToRelative(-7.5f, -4.29f)
                verticalLineToRelative(-8.55f)
                close()
                moveTo(13f, 21.13f)
                verticalLineToRelative(-2.83f)
                lineToRelative(5f, -2.86f)
                verticalLineToRelative(-5.73f)
                lineToRelative(2.5f, -1.43f)
                verticalLineToRelative(8.55f)
                lineToRelative(-7.5f, 4.29f)
                close()
            }
        }.also { _ModelCubeSpace = it}
