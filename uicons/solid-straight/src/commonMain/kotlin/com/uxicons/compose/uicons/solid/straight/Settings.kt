package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Settings: ImageVector? = null

val Icons.Ss.Settings: ImageVector
    get() = _Settings ?: UXIcon(name = "Settings") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 12f)
                arcToRelative(9.14f, 9.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.15f, -1.65f)
                lineTo(23.89f, 8.6f)
                lineToRelative(-3f, -5.2f)
                lineTo(17.85f, 5.16f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 3.51f)
                lineTo(15f, 0f)
                lineTo(9f, 0f)
                lineTo(9f, 3.51f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.15f, 5.16f)
                lineTo(3.11f, 3.4f)
                lineToRelative(-3f, 5.2f)
                lineTo(3.15f, 10.36f)
                arcToRelative(9.1f, 9.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.29f)
                lineTo(0.11f, 15.4f)
                lineToRelative(3f, 5.2f)
                lineToRelative(3.04f, -1.76f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 20.49f)
                lineTo(9f, 24f)
                horizontalLineToRelative(6f)
                lineTo(15f, 20.49f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.85f, -1.65f)
                lineTo(20.89f, 20.6f)
                lineToRelative(3f, -5.2f)
                lineTo(20.85f, 13.64f)
                arcTo(9.14f, 9.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
                close()
                moveTo(15f, 12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, -3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                close()
            }
        }.also { _Settings = it}
