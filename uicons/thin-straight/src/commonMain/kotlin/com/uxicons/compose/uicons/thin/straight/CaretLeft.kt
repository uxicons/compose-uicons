package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaretLeft: ImageVector? = null

val Icons.Ts.CaretLeft: ImageVector
    get() = _CaretLeft ?: UXIcon(name = "CaretLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 19.3f)
                lineToRelative(-6.35f, -5.8f)
                curveToRelative(-0.42f, -0.38f, -0.67f, -0.93f, -0.65f, -1.51f)
                curveToRelative(0.01f, -0.55f, 0.25f, -1.07f, 0.66f, -1.44f)
                lineToRelative(6.34f, -5.8f)
                verticalLineToRelative(14.55f)
                close()
                moveTo(14f, 7.02f)
                lineToRelative(-4.67f, 4.27f)
                curveToRelative(-0.21f, 0.19f, -0.33f, 0.44f, -0.33f, 0.72f)
                curveToRelative(-0.01f, 0.29f, 0.11f, 0.56f, 0.33f, 0.75f)
                lineToRelative(4.67f, 4.28f)
                lineTo(14f, 7.02f)
                close()
            }
        }.also { _CaretLeft = it}
