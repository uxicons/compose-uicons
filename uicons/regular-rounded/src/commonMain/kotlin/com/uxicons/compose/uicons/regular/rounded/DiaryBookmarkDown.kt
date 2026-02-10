package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiaryBookmarkDown: ImageVector? = null

val Icons.Rr.DiaryBookmarkDown: ImageVector
    get() = _DiaryBookmarkDown ?: UXIcon(name = "DiaryBookmarkDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 0f)
                lineTo(7f, 0f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.14f, 0.49f, 2.22f, 1.33f, 2.98f)
                curveToRelative(0.41f, 0.37f, 1.04f, 0.34f, 1.41f, -0.08f)
                curveToRelative(0.37f, -0.41f, 0.33f, -1.04f, -0.08f, -1.41f)
                curveToRelative(-0.42f, -0.38f, -0.67f, -0.92f, -0.67f, -1.49f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(0.01f)
                lineToRelative(0.03f, 5.35f)
                curveToRelative(0f, 0.62f, 0.79f, 0.89f, 1.17f, 0.4f)
                lineToRelative(1.33f, -1.74f)
                lineToRelative(1.33f, 1.74f)
                curveToRelative(0.38f, 0.49f, 1.17f, 0.23f, 1.17f, -0.4f)
                lineToRelative(-0.03f, -5.35f)
                horizontalLineToRelative(8.99f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(22f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(4f, 16.54f)
                lineTo(4f, 5f)
                curveToRelative(0f, -1.3f, 0.84f, -2.42f, 2f, -2.83f)
                verticalLineToRelative(13.83f)
                curveToRelative(-0.73f, 0f, -1.41f, 0.2f, -2f, 0.54f)
                close()
                moveTo(8f, 16f)
                lineTo(8f, 2f)
                horizontalLineToRelative(9f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-12f)
                close()
            }
        }.also { _DiaryBookmarkDown = it}
