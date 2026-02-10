package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookArrowRight: ImageVector? = null

val Icons.Tr.BookArrowRight: ImageVector
    get() = _BookArrowRight ?: UXIcon(name = "BookArrowRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10.5f)
                curveToRelative(0.01f, 0.51f, -0.19f, 1.06f, -0.58f, 1.45f)
                lineToRelative(-2.58f, 2.42f)
                curveToRelative(-0.2f, 0.19f, -0.52f, 0.18f, -0.71f, -0.02f)
                curveToRelative(-0.19f, -0.2f, -0.18f, -0.52f, 0.02f, -0.71f)
                lineToRelative(2.57f, -2.4f)
                curveToRelative(0.07f, -0.07f, 0.12f, -0.15f, 0.17f, -0.23f)
                lineTo(11.5f, 11.0f)
                curveToRelative(-0.65f, 0.01f, -0.65f, -1.01f, 0f, -1f)
                horizontalLineToRelative(11.32f)
                curveToRelative(-0.03f, -0.05f, -0.07f, -0.09f, -0.11f, -0.13f)
                lineToRelative(-2.56f, -2.51f)
                curveToRelative(-0.2f, -0.19f, -0.2f, -0.51f, -0.01f, -0.71f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.2f, 0.71f, -0.01f)
                lineToRelative(2.57f, 2.52f)
                curveToRelative(0.35f, 0.35f, 0.55f, 0.88f, 0.58f, 1.34f)
                close()
                moveTo(20f, 16.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(3.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.02f, 2.02f, 0f, 4.5f, 0f)
                lineTo(15.5f, 0f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(5f, 1f)
                lineTo(5f, 17f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-0.5f)
                curveToRelative(-0.01f, -0.65f, 1.01f, -0.65f, 1f, 0f)
                close()
                moveTo(1f, 18.05f)
                curveToRelative(0.64f, -0.65f, 1.52f, -1.05f, 2.5f, -1.05f)
                horizontalLineToRelative(0.5f)
                lineTo(4f, 1.04f)
                curveToRelative(-1.69f, 0.24f, -3f, 1.7f, -3f, 3.46f)
                verticalLineToRelative(13.55f)
                close()
                moveTo(19f, 18f)
                lineTo(3.5f, 18f)
                curveToRelative(-3.29f, 0.06f, -3.28f, 4.94f, 0f, 5f)
                lineTo(15.5f, 23f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }.also { _BookArrowRight = it}
