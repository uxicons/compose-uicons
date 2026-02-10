package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stroopwafel: ImageVector? = null

val Icons.Ss.Stroopwafel: ImageVector
    get() = _Stroopwafel ?: UXIcon(name = "Stroopwafel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.06f, 9.42f)
                lineToRelative(2.59f, 2.59f)
                lineToRelative(-2.59f, 2.59f)
                lineToRelative(-2.59f, -2.59f)
                lineToRelative(2.59f, -2.59f)
                close()
                moveTo(24.05f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0.05f, 18.62f, 0.05f, 12f)
                reflectiveCurveTo(5.43f, 0f, 12.05f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(17.47f, 12.01f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(-2.59f, -2.59f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(-2.29f, -2.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(-2.59f, 2.59f)
                lineToRelative(-2.29f, -2.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(2.59f, 2.59f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.29f, -2.29f)
                lineToRelative(2.59f, -2.59f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.29f, -2.29f)
                close()
            }
        }.also { _Stroopwafel = it}
