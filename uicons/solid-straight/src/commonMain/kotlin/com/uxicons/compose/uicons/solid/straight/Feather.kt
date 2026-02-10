package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Feather: ImageVector? = null

val Icons.Ss.Feather: ImageVector
    get() = _Feather ?: UXIcon(name = "Feather") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.97f, 2.94f)
                arcToRelative(29.73f, 29.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.49f, 8.06f)
                horizontalLineToRelative(-7.07f)
                lineToRelative(3.54f, -3.54f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-6.54f, 6.54f)
                verticalLineToRelative(-8.42f)
                arcToRelative(30.12f, 30.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.04f, -4.14f)
                arcToRelative(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.94f, 2.91f)
                close()
                moveTo(8f, 5.53f)
                arcToRelative(24.71f, 24.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.74f, 2.34f)
                arcToRelative(7.75f, 7.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, 5.84f)
                arcToRelative(7.64f, 7.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.57f, 4.3f)
                lineToRelative(3.42f, -3.42f)
                close()
                moveTo(10.59f, 20.99f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.91f, -2.55f)
                arcToRelative(26.62f, 26.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.96f, -5.44f)
                horizontalLineToRelative(-8.05f)
                lineToRelative(-6.42f, 6.42f)
                arcToRelative(7.44f, 7.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.59f, 1.57f)
                close()
                moveTo(4.58f, 18.01f)
                lineTo(0.04f, 22.54f)
                lineTo(1.46f, 23.96f)
                lineTo(5.99f, 19.42f)
                curveToRelative(-0.05f, -0.04f, -0.12f, -0.07f, -0.17f, -0.12f)
                arcToRelative(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.24f, -1.3f)
                close()
            }
        }.also { _Feather = it}
