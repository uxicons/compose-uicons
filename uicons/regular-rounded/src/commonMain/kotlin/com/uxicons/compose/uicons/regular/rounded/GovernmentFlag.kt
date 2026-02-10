package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GovernmentFlag: ImageVector? = null

val Icons.Rr.GovernmentFlag: ImageVector
    get() = _GovernmentFlag ?: UXIcon(name = "GovernmentFlag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 22f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-8.0f)
                curveToRelative(1.1f, -0.0f, 2f, -0.9f, 2f, -2.01f)
                curveToRelative(0f, -0.74f, -0.4f, -1.41f, -1.05f, -1.76f)
                lineToRelative(-8.6f, -4.69f)
                curveToRelative(-0.11f, -0.06f, -0.23f, -0.09f, -0.35f, -0.14f)
                verticalLineToRelative(-1.02f)
                lineToRelative(2.63f, -1.64f)
                curveToRelative(0.49f, -0.33f, 0.48f, -1.06f, -0.02f, -1.38f)
                lineTo(13.15f, 0.21f)
                curveToRelative(-0.23f, -0.14f, -0.48f, -0.21f, -0.75f, -0.21f)
                curveToRelative(-0.78f, 0f, -1.42f, 0.63f, -1.42f, 1.42f)
                verticalLineToRelative(3.58f)
                horizontalLineToRelative(0.01f)
                verticalLineToRelative(0.4f)
                curveToRelative(-0.12f, 0.04f, -0.24f, 0.08f, -0.35f, 0.14f)
                lineTo(2.05f, 10.23f)
                curveToRelative(-0.65f, 0.35f, -1.05f, 1.02f, -1.05f, 1.76f)
                curveToRelative(0f, 1.1f, 0.9f, 2.0f, 2f, 2.01f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(20f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(11f, 14f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                close()
                moveTo(17f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                close()
                moveTo(3.0f, 11.99f)
                lineToRelative(8.6f, -4.69f)
                curveToRelative(0.24f, -0.14f, 0.54f, -0.14f, 0.78f, 0f)
                lineToRelative(8.6f, 4.71f)
                lineToRelative(-17.99f, -0.01f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(5f, 14.0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                close()
            }
        }.also { _GovernmentFlag = it}
