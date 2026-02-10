package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCrown: ImageVector? = null

val Icons.Rr.UserCrown: ImageVector
    get() = _UserCrown ?: UXIcon(name = "UserCrown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.14f, 23.99f)
                curveToRelative(-0.05f, 0.01f, -0.1f, 0.01f, -0.14f, 0.01f)
                curveToRelative(-0.49f, 0f, -0.92f, -0.36f, -0.99f, -0.86f)
                curveToRelative(-0.42f, -2.93f, -3.0f, -5.14f, -6.01f, -5.14f)
                reflectiveCurveToRelative(-5.59f, 2.21f, -6.01f, 5.14f)
                curveToRelative(-0.08f, 0.55f, -0.59f, 0.92f, -1.13f, 0.85f)
                curveToRelative(-0.55f, -0.08f, -0.93f, -0.58f, -0.85f, -1.13f)
                curveToRelative(0.56f, -3.91f, 3.99f, -6.86f, 7.99f, -6.86f)
                reflectiveCurveToRelative(7.43f, 2.95f, 7.99f, 6.86f)
                curveToRelative(0.08f, 0.55f, -0.3f, 1.05f, -0.85f, 1.13f)
                close()
                moveTo(6f, 8f)
                lineTo(6f, 0.76f)
                curveToRelative(0f, -0.75f, 0.98f, -1.05f, 1.4f, -0.42f)
                lineToRelative(1.6f, 2.66f)
                lineTo(11.3f, 0.32f)
                curveToRelative(0.37f, -0.43f, 1.04f, -0.43f, 1.41f, 0f)
                lineToRelative(2.3f, 2.68f)
                lineToRelative(1.6f, -2.66f)
                curveToRelative(0.42f, -0.63f, 1.4f, -0.33f, 1.4f, 0.42f)
                verticalLineToRelative(7.24f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(8f, 7f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-8f)
                close()
            }
        }.also { _UserCrown = it}
