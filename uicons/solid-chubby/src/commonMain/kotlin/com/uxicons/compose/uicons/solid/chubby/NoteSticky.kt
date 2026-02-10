package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoteSticky: ImageVector? = null

val Icons.Sc.NoteSticky: ImageVector
    get() = _NoteSticky ?: UXIcon(name = "NoteSticky") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.43f, 17.04f)
                lineToRelative(-5.74f, 5.74f)
                curveToRelative(-0.09f, -2.74f, 0.08f, -4.59f, 0.2f, -5.51f)
                curveToRelative(1.07f, -0.14f, 3.23f, -0.36f, 5.54f, -0.23f)
                close()
                moveTo(15.04f, 16.18f)
                curveToRelative(0.09f, -0.4f, 0.4f, -0.7f, 0.8f, -0.77f)
                curveToRelative(0.14f, -0.03f, 3.41f, -0.58f, 7.0f, -0.34f)
                curveToRelative(0.09f, -1.07f, 0.15f, -2.11f, 0.15f, -3.06f)
                curveToRelative(0f, -4.5f, -0.98f, -9.02f, -1.02f, -9.21f)
                curveToRelative(-0.08f, -0.38f, -0.38f, -0.68f, -0.76f, -0.76f)
                curveToRelative(-0.19f, -0.04f, -4.71f, -1.02f, -9.21f, -1.02f)
                reflectiveCurveToRelative(-9.03f, 0.98f, -9.21f, 1.02f)
                curveToRelative(-0.38f, 0.08f, -0.68f, 0.38f, -0.76f, 0.76f)
                curveToRelative(-0.04f, 0.19f, -1.02f, 4.71f, -1.02f, 9.21f)
                reflectiveCurveToRelative(0.98f, 9.02f, 1.02f, 9.21f)
                curveToRelative(0.08f, 0.38f, 0.38f, 0.68f, 0.76f, 0.76f)
                curveToRelative(0.19f, 0.04f, 4.71f, 1.02f, 9.21f, 1.02f)
                curveToRelative(0.84f, 0f, 1.75f, -0.05f, 2.69f, -0.12f)
                curveToRelative(-0.15f, -4.35f, 0.34f, -6.61f, 0.35f, -6.71f)
                close()
            }
        }.also { _NoteSticky = it}
