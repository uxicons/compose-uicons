package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Globe: ImageVector? = null

val Icons.Sr.Globe: ImageVector
    get() = _Globe ?: UXIcon(name = "Globe") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(15.22f, 7f)
                lineTo(8.78f, 7f)
                arcTo(19.61f, 19.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2.41f)
                arcTo(19.57f, 19.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.22f, 7f)
                close()
                moveTo(16.02f, 9f)
                arcToRelative(10.21f, 10.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.48f, 3f)
                arcToRelative(10.21f, 10.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.48f, 3f)
                lineTo(7.98f, 15f)
                arcTo(10.21f, 10.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 12f)
                arcToRelative(10.21f, 10.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.48f, -3f)
                close()
                moveTo(9.4f, 2.36f)
                arcTo(19.68f, 19.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.57f, 7f)
                lineTo(3.35f, 7f)
                arcTo(10.03f, 10.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.4f, 2.36f)
                close()
                moveTo(2f, 12f)
                arcToRelative(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.46f, -3f)
                lineTo(5.9f, 9f)
                arcToRelative(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.4f, 3f)
                arcToRelative(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.4f, 3f)
                lineTo(2.46f, 15f)
                arcTo(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                close()
                moveTo(3.35f, 17f)
                lineTo(6.57f, 17f)
                arcTo(19.68f, 19.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.4f, 21.64f)
                arcTo(10.03f, 10.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.35f, 17f)
                close()
                moveTo(8.78f, 17f)
                horizontalLineToRelative(6.44f)
                arcTo(19.61f, 19.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21.59f)
                arcTo(19.57f, 19.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.78f, 17f)
                close()
                moveTo(14.61f, 21.64f)
                arcTo(19.68f, 19.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.43f, 17f)
                horizontalLineToRelative(3.22f)
                arcTo(10.03f, 10.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.61f, 21.64f)
                close()
                moveTo(22f, 12f)
                arcToRelative(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.46f, 3f)
                lineTo(18.1f, 15f)
                arcToRelative(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.4f, -3f)
                arcToRelative(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.4f, -3f)
                horizontalLineToRelative(3.44f)
                arcTo(9.99f, 9.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                close()
                moveTo(17.43f, 7f)
                arcToRelative(19.68f, 19.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.82f, -4.64f)
                arcTo(10.03f, 10.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.65f, 7f)
                close()
            }
        }.also { _Globe = it}
