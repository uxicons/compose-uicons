package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DeleteDocument: ImageVector? = null

val Icons.Rr.DeleteDocument: ImageVector
    get() = _DeleteDocument ?: UXIcon(name = "DeleteDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.21f, 14.21f)
                lineTo(13.41f, 16f)
                lineToRelative(1.79f, 1.79f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.41f, 1.41f)
                lineTo(12f, 17.41f)
                lineToRelative(-1.79f, 1.79f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -1.41f)
                lineTo(10.59f, 16f)
                lineTo(8.79f, 14.21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, -1.41f)
                lineTo(12f, 14.59f)
                lineToRelative(1.79f, -1.79f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 1.41f)
                close()
                moveTo(22f, 10.48f)
                verticalLineTo(19f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                horizontalLineTo(7f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                verticalLineTo(5f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 0f)
                horizontalLineToRelative(4.51f)
                arcToRelative(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.95f, 2.05f)
                lineToRelative(3.48f, 3.49f)
                arcTo(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 10.48f)
                close()
                moveTo(15.05f, 3.46f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 2.68f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 1f)
                horizontalLineToRelative(4.32f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.78f, -1.05f)
                close()
                moveTo(20f, 10.48f)
                curveToRelative(0f, -0.17f, -0.03f, -0.32f, -0.05f, -0.48f)
                horizontalLineTo(15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(2.05f)
                curveTo(11.84f, 2.03f, 11.68f, 2f, 11.52f, 2f)
                horizontalLineTo(7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 5f)
                verticalLineTo(19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineTo(17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                close()
            }
        }.also { _DeleteDocument = it}
