package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheckDouble: ImageVector? = null

val Icons.Ts.CheckDouble: ImageVector
    get() = _CheckDouble ?: UXIcon(name = "CheckDouble") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.35f, 7.69f)
                lineToRelative(-13.58f, 13.58f)
                curveToRelative(-0.47f, 0.47f, -1.1f, 0.73f, -1.77f, 0.73f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.67f, 0f, -1.3f, -0.26f, -1.77f, -0.74f)
                lineTo(0.67f, 15.65f)
                lineToRelative(0.71f, -0.7f)
                lineToRelative(5.57f, 5.61f)
                curveToRelative(0.28f, 0.28f, 0.66f, 0.44f, 1.06f, 0.44f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.4f, 0f, 0.78f, -0.16f, 1.06f, -0.44f)
                lineToRelative(13.58f, -13.58f)
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(8.0f, 11.0f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.67f, 0f, 1.29f, -0.26f, 1.77f, -0.73f)
                lineTo(17.98f, 2.07f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-8.2f, 8.2f)
                curveToRelative(-0.28f, 0.28f, -0.66f, 0.44f, -1.06f, 0.44f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.4f, -0.0f, -0.78f, -0.16f, -1.06f, -0.45f)
                lineTo(2.86f, 5.38f)
                lineToRelative(-0.71f, 0.7f)
                lineToRelative(4.08f, 4.17f)
                curveToRelative(0.47f, 0.48f, 1.1f, 0.75f, 1.77f, 0.75f)
                close()
            }
        }.also { _CheckDouble = it}
