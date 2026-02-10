package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Globe: ImageVector? = null

val Icons.Ss.Globe: ImageVector
    get() = _Globe ?: UXIcon(name = "Globe") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(20.66f, 7f)
                lineTo(17.43f, 7f)
                arcTo(19.68f, 19.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.6f, 2.34f)
                arcTo(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.66f, 7f)
                close()
                moveTo(16.5f, 12f)
                arcToRelative(10.21f, 10.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.47f, 3f)
                lineTo(7.97f, 15f)
                arcTo(10.21f, 10.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 12f)
                arcToRelative(10.21f, 10.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.47f, -3f)
                horizontalLineToRelative(8.05f)
                arcTo(10.21f, 10.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 12f)
                close()
                moveTo(8.77f, 17f)
                horizontalLineToRelative(6.45f)
                arcTo(19.56f, 19.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21.59f)
                arcTo(19.56f, 19.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.77f, 17f)
                close()
                moveTo(8.77f, 7f)
                arcTo(19.56f, 19.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2.41f)
                arcTo(19.56f, 19.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.23f, 7f)
                close()
                moveTo(9.4f, 2.34f)
                arcTo(19.7f, 19.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.57f, 7f)
                lineTo(3.34f, 7f)
                arcTo(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.4f, 2.34f)
                close()
                moveTo(2.46f, 9f)
                lineTo(5.89f, 9f)
                arcToRelative(11.68f, 11.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 6f)
                lineTo(2.46f, 15f)
                arcToRelative(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -6f)
                close()
                moveTo(3.34f, 17f)
                lineTo(6.57f, 17f)
                arcTo(19.68f, 19.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.4f, 21.66f)
                arcTo(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.34f, 17f)
                close()
                moveTo(14.6f, 21.66f)
                arcTo(19.7f, 19.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.43f, 17f)
                horizontalLineToRelative(3.23f)
                arcTo(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.6f, 21.66f)
                close()
                moveTo(21.54f, 15f)
                lineTo(18.11f, 15f)
                arcToRelative(11.68f, 11.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6f)
                lineTo(21.54f, 9f)
                arcToRelative(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6f)
                close()
            }
        }.also { _Globe = it}
