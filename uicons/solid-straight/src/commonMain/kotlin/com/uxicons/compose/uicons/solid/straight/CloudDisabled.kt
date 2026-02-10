package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudDisabled: ImageVector? = null

val Icons.Ss.CloudDisabled: ImageVector
    get() = _CloudDisabled ?: UXIcon(name = "CloudDisabled") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.86f, 20.44f)
                lineToRelative(2.1f, 2.1f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-22.5f, -22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.1f, 3.1f)
                arcToRelative(7.99f, 7.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.23f, 4.07f)
                arcToRelative(7.99f, 7.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.07f, 13.23f)
                close()
                moveTo(2f, 9f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.9f, 3.67f)
                arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.6f, 10.33f)
                horizontalLineToRelative(10.5f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.38f, -0.37f)
                lineToRelative(-16.01f, -16.01f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.37f, 2.39f)
                close()
            }
        }.also { _CloudDisabled = it}
