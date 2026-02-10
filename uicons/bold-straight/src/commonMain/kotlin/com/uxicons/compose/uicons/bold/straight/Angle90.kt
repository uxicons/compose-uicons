package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Angle90: ImageVector? = null

val Icons.Bs.Angle90: ImageVector
    get() = _Angle90 ?: UXIcon(name = "Angle90") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.95f, 7.49f)
                lineToRelative(1.44f, -2.65f)
                curveToRelative(1.89f, 1.26f, 3.51f, 2.88f, 4.76f, 4.76f)
                lineToRelative(-2.65f, 1.44f)
                curveToRelative(-0.96f, -1.39f, -2.17f, -2.59f, -3.55f, -3.55f)
                close()
                moveTo(11.76f, 3.41f)
                curveToRelative(-2.07f, -0.9f, -4.36f, -1.41f, -6.76f, -1.41f)
                verticalLineToRelative(3f)
                curveToRelative(1.88f, 0f, 3.68f, 0.38f, 5.32f, 1.06f)
                lineToRelative(1.44f, -2.65f)
                close()
                moveTo(19f, 19f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, -2.4f, -0.51f, -4.68f, -1.41f, -6.76f)
                lineToRelative(-2.65f, 1.44f)
                curveToRelative(0.68f, 1.64f, 1.06f, 3.44f, 1.06f, 5.32f)
                close()
                moveTo(3.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                lineTo(3f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(20.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(20.5f)
                verticalLineToRelative(-3f)
                lineTo(3.5f, 21f)
                close()
            }
        }.also { _Angle90 = it}
