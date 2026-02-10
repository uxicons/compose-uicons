package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudMoon: ImageVector? = null

val Icons.Rs.CloudMoon: ImageVector
    get() = _CloudMoon ?: UXIcon(name = "CloudMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.35f, 17.39f)
                arcTo(9.94f, 9.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.76f, 1.25f)
                lineToRelative(1.78f, 0.99f)
                lineToRelative(-1.87f, 0.8f)
                arcToRelative(8.52f, 8.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.28f, 4.4f)
                arcToRelative(7.98f, 7.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.37f, 1.3f)
                arcToRelative(9.8f, 9.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.02f, -6.47f)
                arcTo(7.83f, 7.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.96f, 2f)
                arcTo(7.95f, 7.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.33f, 15.57f)
                arcTo(6.46f, 6.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.35f, 17.39f)
                close()
                moveTo(24f, 18.5f)
                arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.65f, 13f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 15f)
                arcToRelative(5.17f, 5.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.05f, 0.73f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 24f)
                horizontalLineToRelative(9f)
                arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.5f)
                close()
                moveTo(16.92f, 14.25f)
                lineTo(17.1f, 15.18f)
                lineTo(18.14f, 15.04f)
                arcTo(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 15f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 7f)
                horizontalLineToRelative(-9f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.94f, -4.81f)
                lineToRelative(0.81f, -0.33f)
                lineToRelative(-0.22f, -0.85f)
                arcTo(3.92f, 3.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 15f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.92f, -0.75f)
                close()
            }
        }.also { _CloudMoon = it}
