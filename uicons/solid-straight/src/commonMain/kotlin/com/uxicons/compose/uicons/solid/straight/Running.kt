package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Running: ImageVector? = null

val Icons.Ss.Running: ImageVector
    get() = _Running ?: UXIcon(name = "Running") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.57f, 11f)
                lineTo(16.44f, 7.45f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.87f, 6f)
                horizontalLineTo(5.39f)
                lineTo(3.12f, 10.55f)
                lineToRelative(1.79f, 0.89f)
                lineTo(6.63f, 8f)
                horizontalLineTo(9.46f)
                lineTo(7.71f, 12.27f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.17f, 3.67f)
                lineTo(13f, 18.55f)
                verticalLineTo(24f)
                horizontalLineToRelative(2f)
                verticalLineTo(17.45f)
                lineTo(12.39f, 15.8f)
                lineToRelative(2.77f, -6.6f)
                lineTo(17.44f, 13f)
                horizontalLineTo(22.01f)
                verticalLineTo(11f)
                close()
                moveTo(12.51f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.01f, 5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.51f, 2.5f)
                close()
                moveTo(7.82f, 17.64f)
                lineToRelative(0.67f, 0.42f)
                lineTo(7.68f, 20f)
                horizontalLineTo(1.01f)
                verticalLineTo(18f)
                horizontalLineTo(6.34f)
                lineToRelative(0.5f, -1.2f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.82f, 17.64f)
                close()
            }
        }.also { _Running = it}
