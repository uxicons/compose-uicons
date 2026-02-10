package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCanSlash: ImageVector? = null

val Icons.Rs.TrashCanSlash: ImageVector
    get() = _TrashCanSlash ?: UXIcon(name = "TrashCanSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 15.24f)
                verticalLineToRelative(3.76f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.76f)
                lineToRelative(2f, 2f)
                close()
                moveTo(17f, 22f)
                lineTo(7f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-10.76f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(12.76f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(0.77f, 0f, 1.46f, -0.3f, 1.99f, -0.77f)
                lineToRelative(-1.43f, -1.43f)
                curveToRelative(-0.16f, 0.11f, -0.35f, 0.2f, -0.56f, 0.2f)
                close()
                moveTo(13f, 19f)
                horizontalLineToRelative(1.76f)
                lineToRelative(-1.76f, -1.76f)
                verticalLineToRelative(1.76f)
                close()
                moveTo(2.59f, 4f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(3.96f, 3.96f)
                horizontalLineToRelative(1.59f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-0.09f)
                lineToRelative(4.04f, 4.04f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(4.59f, 6f)
                lineToRelative(-2f, -2f)
                close()
                moveTo(9f, 4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 6f)
                lineTo(7.41f, 6f)
                lineToRelative(5.59f, 5.59f)
                verticalLineToRelative(-2.59f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4.59f)
                lineToRelative(3f, 3f)
                lineTo(18f, 6f)
                close()
            }
        }.also { _TrashCanSlash = it}
