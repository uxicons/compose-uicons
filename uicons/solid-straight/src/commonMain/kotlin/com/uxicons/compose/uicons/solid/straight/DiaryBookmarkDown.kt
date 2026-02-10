package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiaryBookmarkDown: ImageVector? = null

val Icons.Ss.DiaryBookmarkDown: ImageVector
    get() = _DiaryBookmarkDown ?: UXIcon(name = "DiaryBookmarkDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 20f)
                verticalLineToRelative(4f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-2.5f, 2.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(5f)
                close()
                moveTo(6f, 18f)
                lineTo(6f, 0f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(15.77f)
                curveToRelative(0.55f, -0.49f, 1.26f, -0.77f, 2f, -0.77f)
                horizontalLineToRelative(2f)
                close()
                moveTo(6f, 20f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(15f, 24f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(4f)
                close()
                moveTo(20f, 0f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(14f)
                lineTo(22f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _DiaryBookmarkDown = it}
