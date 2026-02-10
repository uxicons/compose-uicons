package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallIncoming: ImageVector? = null

val Icons.Rs.CallIncoming: ImageVector
    get() = _CallIncoming ?: UXIcon(name = "CallIncoming") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.2f, 16.26f)
                arcTo(12.13f, 12.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.75f, 9.79f)
                lineToRelative(3.4f, -3.41f)
                lineTo(4.89f, 0.12f)
                lineTo(1.72f, 3.29f)
                arcTo(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7.5f)
                curveTo(0f, 14.75f, 9.25f, 24f, 16.5f, 24f)
                arcToRelative(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.21f, -1.72f)
                lineToRelative(3.17f, -3.17f)
                lineToRelative(-6.26f, -6.26f)
                close()
                moveTo(19.29f, 20.87f)
                arcTo(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 22f)
                curveTo(10.27f, 22f, 2f, 13.73f, 2f, 7.5f)
                arcTo(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.13f, 4.71f)
                lineTo(4.89f, 2.95f)
                lineTo(8.32f, 6.39f)
                lineTo(5.39f, 9.32f)
                lineToRelative(0.24f, 0.61f)
                arcToRelative(14.37f, 14.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.45f, 8.44f)
                lineToRelative(0.61f, 0.23f)
                lineToRelative(2.93f, -2.93f)
                lineToRelative(3.44f, 3.44f)
                close()
                moveTo(15f, 6.53f)
                lineTo(15f, 2f)
                horizontalLineToRelative(2f)
                lineTo(17f, 5.61f)
                curveToRelative(0.66f, -0.66f, 1.45f, -1.46f, 2.24f, -2.25f)
                curveToRelative(1.37f, -1.37f, 2.71f, -2.73f, 3.3f, -3.32f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(-0.59f, 0.59f, -1.94f, 1.94f, -3.3f, 3.31f)
                curveTo(19.88f, 5.55f, 19.1f, 6.34f, 18.44f, 7f)
                lineTo(22f, 7f)
                lineTo(22f, 9f)
                lineTo(17.5f, 9f)
                arcTo(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 6.53f)
                close()
            }
        }.also { _CallIncoming = it}
