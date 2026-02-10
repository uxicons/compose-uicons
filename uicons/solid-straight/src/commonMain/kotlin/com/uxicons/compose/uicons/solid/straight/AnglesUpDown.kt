package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AnglesUpDown: ImageVector? = null

val Icons.Ss.AnglesUpDown: ImageVector
    get() = _AnglesUpDown ?: UXIcon(name = "AnglesUpDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.27f, 10.1f)
                lineToRelative(-1.4f, -1.43f)
                lineTo(9.82f, 0.89f)
                curveToRelative(0.57f, -0.57f, 1.35f, -0.89f, 2.17f, -0.89f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.82f, 0.0f, 1.59f, 0.32f, 2.18f, 0.9f)
                lineToRelative(7.95f, 7.77f)
                lineToRelative(-1.4f, 1.43f)
                lineToRelative(-7.96f, -7.77f)
                curveToRelative(-0.21f, -0.21f, -0.48f, -0.32f, -0.78f, -0.32f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.29f, 0f, -0.56f, 0.11f, -0.77f, 0.32f)
                lineToRelative(-7.96f, 7.78f)
                close()
                moveTo(12.77f, 21.68f)
                curveToRelative(-0.21f, 0.2f, -0.48f, 0.32f, -0.77f, 0.32f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.29f, 0f, -0.56f, -0.11f, -0.77f, -0.32f)
                lineToRelative(-7.95f, -7.77f)
                lineToRelative(-1.4f, 1.43f)
                lineToRelative(7.95f, 7.77f)
                curveToRelative(0.58f, 0.58f, 1.35f, 0.9f, 2.18f, 0.9f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.82f, -0.0f, 1.59f, -0.32f, 2.17f, -0.89f)
                lineToRelative(7.96f, -7.77f)
                lineToRelative(-1.4f, -1.43f)
                lineToRelative(-7.96f, 7.78f)
                close()
            }
        }.also { _AnglesUpDown = it}
