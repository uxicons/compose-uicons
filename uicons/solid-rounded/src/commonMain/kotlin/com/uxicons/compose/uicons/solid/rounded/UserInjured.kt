package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserInjured: ImageVector? = null

val Icons.Sr.UserInjured: ImageVector
    get() = _UserInjured ?: UXIcon(name = "UserInjured") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.91f, 7f)
                curveToRelative(-0.48f, 2.83f, -2.94f, 5f, -5.91f, 5f)
                reflectiveCurveToRelative(-5.43f, -2.17f, -5.91f, -5f)
                horizontalLineToRelative(11.82f)
                close()
                moveTo(17.92f, 5f)
                curveToRelative(-0.17f, -0.98f, -0.57f, -1.88f, -1.15f, -2.64f)
                lineToRelative(-3.91f, 2.64f)
                horizontalLineToRelative(5.07f)
                close()
                moveTo(9.45f, 5f)
                lineTo(15.28f, 0.98f)
                curveToRelative(-0.94f, -0.62f, -2.07f, -0.98f, -3.28f, -0.98f)
                curveToRelative(-2.97f, 0f, -5.43f, 2.17f, -5.91f, 5f)
                horizontalLineToRelative(3.36f)
                close()
                moveTo(15f, 23f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.28f)
                lineToRelative(-1.97f, -7.89f)
                curveToRelative(-3.82f, 0.6f, -6.75f, 3.91f, -6.75f, 7.89f)
                curveToRelative(0f, 0.97f, 0.7f, 2f, 2f, 2f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(12.79f, 14.04f)
                lineToRelative(1.5f, 5.99f)
                curveToRelative(1.52f, 0.15f, 2.71f, 1.42f, 2.71f, 2.97f)
                curveToRelative(0f, 0.35f, -0.07f, 0.69f, -0.18f, 1f)
                horizontalLineToRelative(2.18f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -4.14f, -3.17f, -7.56f, -7.21f, -7.96f)
                close()
            }
        }.also { _UserInjured = it}
