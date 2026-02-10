package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Completed: ImageVector? = null

val Icons.Bs.Completed: ImageVector
    get() = _Completed ?: UXIcon(name = "Completed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.41f, 12f)
                lineToRelative(3.06f, -3f)
                horizontalLineToRelative(1.53f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4.59f)
                close()
                moveTo(22f, 2f)
                verticalLineToRelative(18.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(5.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(2f, 2f)
                horizontalLineToRelative(5.34f)
                curveToRelative(0.56f, -1.18f, 1.77f, -2f, 3.16f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.39f, 0f, 2.6f, 0.82f, 3.16f, 2f)
                horizontalLineToRelative(5.34f)
                close()
                moveTo(19f, 5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 0.28f, 0.23f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(19f, 5f)
                close()
                moveTo(8.67f, 12.01f)
                curveToRelative(0.58f, 0f, 1.17f, -0.23f, 1.62f, -0.68f)
                lineToRelative(2.69f, -2.69f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-2.2f, 2.2f)
                lineToRelative(-0.93f, -0.88f)
                lineToRelative(-2.06f, 2.18f)
                lineToRelative(1.43f, 1.35f)
                curveToRelative(0.45f, 0.42f, 1.01f, 0.63f, 1.57f, 0.63f)
                close()
                moveTo(15.47f, 15f)
                lineToRelative(-3.06f, 3f)
                horizontalLineToRelative(4.59f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.53f)
                close()
                moveTo(10.86f, 12.52f)
                lineToRelative(-2.2f, 2.2f)
                lineToRelative(-0.93f, -0.88f)
                lineToRelative(-2.06f, 2.18f)
                lineToRelative(1.43f, 1.35f)
                curveToRelative(0.45f, 0.42f, 1.01f, 0.63f, 1.57f, 0.63f)
                curveToRelative(0.58f, 0f, 1.17f, -0.23f, 1.62f, -0.68f)
                lineToRelative(2.69f, -2.69f)
                lineToRelative(-2.12f, -2.12f)
                close()
            }
        }.also { _Completed = it}
