package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiaryBookmarks: ImageVector? = null

val Icons.Br.DiaryBookmarks: ImageVector
    get() = _DiaryBookmarks ?: UXIcon(name = "DiaryBookmarks") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 7f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.76f)
            curveToRelative(-1.01f, -1.22f, -2.54f, -2f, -4.24f, -2f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(12f)
            curveToRelative(2.86f, 0f, 5.22f, -2.2f, 5.48f, -5f)
            horizontalLineToRelative(0.52f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(0.5f)
            close()
            moveTo(19f, 5.5f)
            verticalLineToRelative(9.5f)
            horizontalLineToRelative(-10f)
            lineTo(9f, 3f)
            horizontalLineToRelative(7.5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(5.5f, 3f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(12f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.53f, 0f, -1.03f, 0.09f, -1.5f, 0.26f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(16.5f, 21f)
            lineTo(4.5f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(14.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
        }
    }.also { _DiaryBookmarks = it }
