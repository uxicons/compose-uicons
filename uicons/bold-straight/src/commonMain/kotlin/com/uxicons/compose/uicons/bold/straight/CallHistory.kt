package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallHistory: ImageVector? = null

val Icons.Bs.CallHistory: ImageVector
    get() = _CallHistory ?: UXIcon(name = "CallHistory") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.94f, 24f)
                curveTo(8.79f, 24f, 0f, 15.21f, 0f, 8.06f)
                arcTo(6.05f, 6.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.77f, 3.73f)
                lineTo(5.41f, 0.09f)
                lineToRelative(6.64f, 6.64f)
                lineTo(9.09f, 9.7f)
                arcTo(10.69f, 10.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.3f, 14.92f)
                lineToRelative(2.97f, -2.97f)
                lineTo(23.91f, 18.59f)
                lineToRelative(-3.65f, 3.65f)
                arcTo(6.05f, 6.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.94f, 24f)
                close()
                moveTo(5.41f, 4.33f)
                lineTo(3.89f, 5.86f)
                arcTo(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 8.06f)
                curveTo(3f, 13.93f, 10.95f, 21f, 15.94f, 21f)
                arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.2f, -0.89f)
                lineToRelative(1.52f, -1.52f)
                lineToRelative(-2.4f, -2.4f)
                lineToRelative(-2.25f, 2.25f)
                lineToRelative(-0.91f, -0.35f)
                arcTo(13.94f, 13.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.91f, 9.92f)
                lineTo(5.54f, 9f)
                lineTo(7.81f, 6.73f)
                close()
                moveTo(12.23f, 4.08f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.68f, 7.68f)
                lineToRelative(2.14f, 2.14f)
                arcToRelative(8.5f, 8.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.96f, -11.96f)
                close()
                moveTo(16.44f, 11.44f)
                lineTo(14f, 9f)
                lineTo(14f, 5f)
                horizontalLineToRelative(3f)
                lineTo(17f, 7.76f)
                lineToRelative(1.56f, 1.56f)
                close()
            }
        }.also { _CallHistory = it}
