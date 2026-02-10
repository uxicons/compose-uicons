package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RemoteControl: ImageVector? = null

val Icons.Rs.RemoteControl: ImageVector
    get() = _RemoteControl ?: UXIcon(name = "RemoteControl") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                lineTo(16f, 0f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                close()
                moveTo(18f, 8f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                verticalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(11f, 11.49f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(14f, 14.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(8f, 14.49f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(11f, 14.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(10.99f, 3.08f)
                lineToRelative(9.92f, 9.9f)
                lineToRelative(-9.97f, 10.01f)
                curveToRelative(-1.26f, 1.32f, -3.69f, 1.32f, -4.95f, 0f)
                lineTo(1.03f, 18.05f)
                curveToRelative(-1.36f, -1.3f, -1.36f, -3.65f, -0.0f, -4.95f)
                lineTo(10.99f, 3.08f)
                close()
                moveTo(10.99f, 5.92f)
                lineTo(2.44f, 14.51f)
                curveToRelative(-0.58f, 0.56f, -0.58f, 1.57f, 0f, 2.12f)
                lineToRelative(4.97f, 4.95f)
                curveToRelative(0.52f, 0.55f, 1.6f, 0.55f, 2.12f, 0.0f)
                lineToRelative(8.56f, -8.59f)
                lineToRelative(-7.09f, -7.08f)
                close()
            }
        }.also { _RemoteControl = it}
