package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiaryBookmarkDown: ImageVector? = null

val Icons.Sr.DiaryBookmarkDown: ImageVector
    get() = _DiaryBookmarkDown ?: UXIcon(name = "DiaryBookmarkDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 18f)
                lineToRelative(0.04f, 5.35f)
                curveToRelative(0f, 0.62f, -0.79f, 0.89f, -1.17f, 0.4f)
                lineToRelative(-1.33f, -1.74f)
                lineToRelative(-1.33f, 1.74f)
                curveToRelative(-0.38f, 0.49f, -1.17f, 0.23f, -1.17f, -0.4f)
                lineToRelative(-0.04f, -5.35f)
                horizontalLineToRelative(5f)
                close()
                moveTo(5f, 16f)
                horizontalLineToRelative(1f)
                lineTo(6f, 0.1f)
                curveTo(3.67f, 0.57f, 2f, 2.62f, 2f, 5f)
                verticalLineToRelative(12.03f)
                curveToRelative(0.7f, -0.53f, 1.52f, -0.86f, 2.4f, -0.96f)
                curveToRelative(0.2f, -0.04f, 0.4f, -0.06f, 0.6f, -0.06f)
                close()
                moveTo(6f, 18f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6f)
                close()
                moveTo(17f, 0f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(14f)
                lineTo(22f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(15f, 24f)
                horizontalLineToRelative(2f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _DiaryBookmarkDown = it}
