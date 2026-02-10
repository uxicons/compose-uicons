package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiaryBookmarkDown: ImageVector? = null

val Icons.Bs.DiaryBookmarkDown: ImageVector
    get() = _DiaryBookmarkDown ?: UXIcon(name = "DiaryBookmarkDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(5f, 0f)
                curveTo(2.79f, 0f, 1f, 1.79f, 1f, 4f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                verticalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(2.5f, 2.5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(9f)
                lineTo(23f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(4f, 16.13f)
                lineTo(4f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.34f, 0f, -0.68f, 0.04f, -1f, 0.13f)
                close()
                moveTo(10f, 16f)
                lineTo(10f, 3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-10f)
                close()
            }
        }.also { _DiaryBookmarkDown = it}
