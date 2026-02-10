package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiaryBookmarkDown: ImageVector? = null

val Icons.Br.DiaryBookmarkDown: ImageVector
    get() = _DiaryBookmarkDown ?: UXIcon(name = "DiaryBookmarkDown") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.5f, 0f)
            lineTo(6.5f, 0f)
            curveTo(3.47f, 0f, 1f, 2.47f, 1f, 5.5f)
            verticalLineToRelative(14f)
            curveToRelative(0f, 1.28f, 0.55f, 2.5f, 1.5f, 3.35f)
            curveToRelative(0.62f, 0.56f, 1.56f, 0.5f, 2.12f, -0.12f)
            curveToRelative(0.55f, -0.62f, 0.5f, -1.56f, -0.12f, -2.12f)
            curveToRelative(-0.32f, -0.29f, -0.5f, -0.69f, -0.5f, -1.12f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(5.35f)
            curveToRelative(0f, 0.62f, 0.79f, 0.89f, 1.17f, 0.4f)
            lineToRelative(1.33f, -1.74f)
            lineToRelative(1.33f, 1.74f)
            curveToRelative(0.38f, 0.49f, 1.17f, 0.23f, 1.17f, -0.4f)
            verticalLineToRelative(-5.35f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(23f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(4f, 15.26f)
            lineTo(4f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(12f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.53f, 0f, -1.03f, 0.09f, -1.5f, 0.26f)
            close()
            moveTo(20f, 15f)
            horizontalLineToRelative(-10f)
            lineTo(10f, 3f)
            horizontalLineToRelative(7.5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(9.5f)
            close()
        }
    }.also { _DiaryBookmarkDown = it }
