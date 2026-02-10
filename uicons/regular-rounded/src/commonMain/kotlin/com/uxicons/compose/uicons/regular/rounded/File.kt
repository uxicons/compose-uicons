package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _File: ImageVector? = null

val Icons.Rr.File: ImageVector
    get() = _File ?: UXIcon(name = "File") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.95f, 5.54f)
                lineTo(16.46f, 2.05f)
                arcTo(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.52f, 0f)
                horizontalLineTo(7f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5f)
                verticalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                horizontalLineTo(17f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineTo(10.48f)
                arcTo(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.95f, 5.54f)
                close()
                moveTo(18.54f, 6.95f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.32f, 8f)
                horizontalLineTo(15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(2.68f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.05f, 0.78f)
                close()
                moveTo(20f, 19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineTo(7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 2f)
                horizontalLineToRelative(4.51f)
                curveToRelative(0.16f, 0f, 0.32f, 0.03f, 0.48f, 0.05f)
                verticalLineTo(7f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(4.95f)
                curveToRelative(0.01f, 0.16f, 0.05f, 0.32f, 0.05f, 0.48f)
                close()
            }
        }.also { _File = it}
