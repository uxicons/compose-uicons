package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCrown: ImageVector? = null

val Icons.Sc.UserCrown: ImageVector
    get() = _UserCrown ?: UXIcon(name = "UserCrown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 8.54f)
                verticalLineToRelative(1.46f)
                curveToRelative(0f, 3.41f, -1.59f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -1.59f, -5f, -5f)
                verticalLineToRelative(-1.46f)
                curveToRelative(1.1f, 0.21f, 2.83f, 0.46f, 5f, 0.46f)
                reflectiveCurveToRelative(3.9f, -0.25f, 5f, -0.46f)
                close()
                moveTo(6.96f, 6.49f)
                curveToRelative(0.92f, 0.2f, 2.71f, 0.51f, 5.04f, 0.51f)
                reflectiveCurveToRelative(4.12f, -0.31f, 5.04f, -0.51f)
                curveToRelative(0.02f, -0.48f, 0.04f, -1.05f, 0.07f, -1.6f)
                curveToRelative(0.06f, -1.3f, -0.1f, -2.92f, -0.11f, -2.99f)
                curveToRelative(-0.05f, -0.51f, -0.48f, -0.9f, -0.99f, -0.9f)
                curveToRelative(-0.73f, 0f, -1.62f, 0.58f, -2.4f, 1.34f)
                curveToRelative(-0.41f, -0.57f, -0.83f, -0.99f, -0.9f, -1.06f)
                curveToRelative(-0.39f, -0.38f, -1.01f, -0.38f, -1.4f, 0f)
                curveToRelative(-0.07f, 0.07f, -0.49f, 0.49f, -0.9f, 1.06f)
                curveToRelative(-0.78f, -0.76f, -1.67f, -1.34f, -2.4f, -1.34f)
                curveToRelative(-0.51f, 0f, -0.94f, 0.39f, -0.99f, 0.9f)
                curveToRelative(-0.01f, 0.07f, -0.17f, 1.7f, -0.11f, 2.99f)
                curveToRelative(0.03f, 0.54f, 0.05f, 1.12f, 0.07f, 1.6f)
                close()
                moveTo(19.99f, 21.85f)
                curveToRelative(-0.59f, -3.99f, -3.13f, -5.85f, -7.99f, -5.85f)
                reflectiveCurveToRelative(-7.39f, 1.86f, -7.99f, 5.85f)
                curveToRelative(-0.1f, 0.58f, 0.4f, 1.16f, 0.99f, 1.15f)
                horizontalLineToRelative(14f)
                curveToRelative(0.59f, 0.01f, 1.09f, -0.56f, 0.99f, -1.15f)
                close()
            }
        }.also { _UserCrown = it}
