package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CustomizeEdit: ImageVector? = null

val Icons.Rs.CustomizeEdit: ImageVector
    get() = _CustomizeEdit ?: UXIcon(name = "CustomizeEdit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 11.99f)
                lineToRelative(2f, -2f)
                verticalLineToRelative(11.01f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(0f, 6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(11.43f)
                lineToRelative(-1.76f, 2f)
                lineTo(3f, 5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(15f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-9.01f)
                close()
                moveTo(6f, 17f)
                horizontalLineToRelative(5f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                curveToRelative(-4f, 0f, -5f, 6f, -5f, 6f)
                close()
                moveTo(23.14f, 0.86f)
                curveToRelative(-1.15f, -1.15f, -3.01f, -1.15f, -4.16f, -0.0f)
                curveToRelative(-0.04f, 0.04f, -0.08f, 0.08f, -0.11f, 0.12f)
                lineToRelative(-7.22f, 8.08f)
                curveToRelative(0.74f, 0.1f, 1.43f, 0.34f, 2.03f, 0.73f)
                lineToRelative(6.68f, -7.48f)
                curveToRelative(0.35f, -0.39f, 0.95f, -0.42f, 1.33f, -0.07f)
                curveToRelative(0.01f, 0.01f, 0.03f, 0.02f, 0.04f, 0.04f)
                curveToRelative(0.37f, 0.37f, 0.37f, 0.96f, 0.0f, 1.33f)
                curveToRelative(0f, 0f, 0f, 0f, -0.0f, 0.0f)
                lineToRelative(-7.04f, 7.04f)
                curveToRelative(0.47f, 0.51f, 0.82f, 1.12f, 1.04f, 1.79f)
                lineToRelative(7.41f, -7.41f)
                curveToRelative(1.15f, -1.15f, 1.15f, -3.01f, 0f, -4.16f)
                close()
            }
        }.also { _CustomizeEdit = it}
