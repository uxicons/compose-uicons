package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCanSlash: ImageVector? = null

val Icons.Ts.TrashCanSlash: ImageVector
    get() = _TrashCanSlash ?: UXIcon(name = "TrashCanSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12.54f)
                verticalLineToRelative(6.46f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7.46f)
                lineToRelative(1f, 1f)
                close()
                moveTo(17.5f, 23f)
                lineTo(6.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-12.96f)
                lineToRelative(-1f, -1f)
                verticalLineToRelative(13.96f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.81f, 0f, 1.52f, -0.39f, 1.98f, -0.99f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(-0.27f, 0.42f, -0.73f, 0.7f, -1.26f, 0.7f)
                close()
                moveTo(11.5f, 15.04f)
                verticalLineToRelative(3.96f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2.96f)
                lineToRelative(-1f, -1f)
                close()
                moveTo(23.95f, 23.25f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(0.05f, 0.75f)
                lineTo(0.75f, 0.05f)
                lineToRelative(3.95f, 3.95f)
                horizontalLineToRelative(2.29f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(14.29f)
                lineToRelative(3.95f, 3.95f)
                close()
                moveTo(8f, 4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(5.71f, 5f)
                lineToRelative(5.79f, 5.79f)
                verticalLineToRelative(-1.79f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2.79f)
                lineToRelative(2.5f, 2.5f)
                verticalLineToRelative(-5.29f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6.29f)
                lineToRelative(3f, 3f)
                lineTo(19f, 5f)
                lineTo(5.71f, 5f)
                close()
            }
        }.also { _TrashCanSlash = it}
