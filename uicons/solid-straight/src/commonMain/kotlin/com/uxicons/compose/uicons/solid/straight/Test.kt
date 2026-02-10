package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Test: ImageVector? = null

val Icons.Ss.Test: ImageVector
    get() = _Test ?: UXIcon(name = "Test") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.19f, 13f)
                arcToRelative(4.9f, 4.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, -0.77f)
                lineToRelative(0.57f, -1.19f)
                lineToRelative(0.54f, 1.19f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.25f, 0.77f)
                close()
                moveTo(21f, 7f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7f)
                close()
                moveTo(11.96f, 19.46f)
                lineTo(10.54f, 18.05f)
                lineTo(8.68f, 19.93f)
                arcToRelative(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.35f, 0.01f)
                lineToRelative(-0.87f, -0.88f)
                lineToRelative(-1.43f, 1.4f)
                lineToRelative(0.87f, 0.89f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.19f, 0f)
                close()
                moveTo(13f, 15f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.7f)
                arcToRelative(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.62f, -2.88f)
                lineToRelative(-0.52f, -1.15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.7f, -0.04f)
                lineToRelative(-0.54f, 1.19f)
                arcToRelative(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.62f, 2.88f)
                verticalLineToRelative(1.7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                close()
                moveTo(18f, 19f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(20.79f, 5f)
                horizontalLineToRelative(-4.79f)
                verticalLineToRelative(-4.78f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.59f, 0.95f)
                lineToRelative(2.24f, 2.24f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.96f, 1.59f)
                close()
            }
        }.also { _Test = it}
