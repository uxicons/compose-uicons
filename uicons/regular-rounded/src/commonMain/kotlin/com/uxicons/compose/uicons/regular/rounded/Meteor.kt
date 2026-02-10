package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Meteor: ImageVector? = null

val Icons.Rr.Meteor: ImageVector
    get() = _Meteor ?: UXIcon(name = "Meteor") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 24f)
                arcToRelative(8.97f, 8.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.36f, -2.63f)
                horizontalLineToRelative(0f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -12.73f)
                curveTo(4.89f, 6.38f, 9.82f, 3.11f, 12.55f, 1.36f)
                arcTo(2.24f, 2.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 3.24f)
                lineToRelative(4.86f, -2.9f)
                arcToRelative(2.02f, 2.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.53f, 0.28f)
                arcToRelative(2.03f, 2.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.28f, 2.56f)
                lineTo(20.77f, 8f)
                arcToRelative(2.24f, 2.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.87f, 3.45f)
                curveToRelative(-1.75f, 2.73f, -5.02f, 7.66f, -7.28f, 9.91f)
                arcTo(8.97f, 8.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 24f)
                close()
                moveTo(4.05f, 19.95f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.9f, 0f)
                curveToRelative(2.12f, -2.13f, 5.3f, -6.91f, 7.01f, -9.58f)
                arcToRelative(0.23f, 0.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.01f, -0.24f)
                arcTo(0.23f, 0.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.75f, 10f)
                lineTo(19f, 10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.86f, -1.52f)
                lineToRelative(3.83f, -6.35f)
                lineToRelative(-0.03f, -0.11f)
                lineTo(15.51f, 5.86f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 5f)
                lineTo(14f, 3.25f)
                arcToRelative(0.24f, 0.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.37f, -0.21f)
                curveTo(10.96f, 4.75f, 6.17f, 7.93f, 4.05f, 10.05f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9.9f)
                close()
                moveTo(9f, 19f)
                curveToRelative(-5.28f, -0.14f, -5.27f, -7.86f, 0f, -8f)
                curveTo(14.28f, 11.14f, 14.27f, 18.86f, 9f, 19f)
                close()
                moveTo(9f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 13f)
                close()
            }
        }.also { _Meteor = it}
