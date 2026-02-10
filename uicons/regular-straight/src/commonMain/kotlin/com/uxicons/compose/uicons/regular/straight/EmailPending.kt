package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailPending: ImageVector? = null

val Icons.Rs.EmailPending: ImageVector
    get() = _EmailPending ?: UXIcon(name = "EmailPending") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 12.92f)
                curveToRelative(0.75f, -0.44f, 1.43f, -0.99f, 2f, -1.64f)
                verticalLineToRelative(12.72f)
                lineTo(0f, 24f)
                lineTo(0f, 6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(7.59f)
                curveToRelative(-0.26f, 0.63f, -0.43f, 1.3f, -0.52f, 2f)
                lineTo(3f, 5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.24f)
                lineToRelative(7.88f, 7.88f)
                curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0f)
                lineToRelative(0.75f, -0.75f)
                curveToRelative(0.7f, 0.3f, 1.46f, 0.5f, 2.25f, 0.58f)
                lineToRelative(-1.58f, 1.58f)
                curveToRelative(-0.97f, 0.97f, -2.26f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.56f, -0.49f, -3.54f, -1.46f)
                lineToRelative(-6.46f, -6.46f)
                verticalLineToRelative(12.93f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-9.08f)
                close()
                moveTo(12f, 6f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(14f, 6f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                close()
                moveTo(20.71f, 7.29f)
                lineToRelative(-1.71f, -1.71f)
                verticalLineToRelative(-2.59f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.41f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.also { _EmailPending = it}
