package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCrown: ImageVector? = null

val Icons.Sr.UserCrown: ImageVector
    get() = _UserCrown ?: UXIcon(name = "UserCrown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 24f)
                lineTo(5f, 24f)
                curveToRelative(-0.29f, 0f, -0.56f, -0.13f, -0.76f, -0.34f)
                reflectiveCurveToRelative(-0.28f, -0.51f, -0.23f, -0.8f)
                curveToRelative(0.56f, -3.91f, 3.99f, -6.86f, 7.99f, -6.86f)
                reflectiveCurveToRelative(7.43f, 2.95f, 7.99f, 6.86f)
                curveToRelative(0.04f, 0.29f, -0.04f, 0.58f, -0.23f, 0.8f)
                reflectiveCurveToRelative(-0.47f, 0.34f, -0.76f, 0.34f)
                close()
                moveTo(15f, 3f)
                lineTo(12.7f, 0.32f)
                curveToRelative(-0.37f, -0.43f, -1.04f, -0.43f, -1.41f, 0f)
                lineToRelative(-2.3f, 2.68f)
                lineTo(7.4f, 0.34f)
                curveToRelative(-0.42f, -0.63f, -1.4f, -0.33f, -1.4f, 0.42f)
                verticalLineToRelative(5.24f)
                horizontalLineToRelative(12f)
                lineTo(18f, 0.76f)
                curveToRelative(0f, -0.75f, -0.98f, -1.05f, -1.4f, -0.42f)
                lineToRelative(-1.6f, 2.66f)
                close()
                moveTo(6f, 8f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                lineTo(6f, 8f)
                close()
            }
        }.also { _UserCrown = it}
