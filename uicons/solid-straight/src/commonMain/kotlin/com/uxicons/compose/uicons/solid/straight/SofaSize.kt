package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SofaSize: ImageVector? = null

val Icons.Ss.SofaSize: ImageVector
    get() = _SofaSize ?: UXIcon(name = "SofaSize") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.52f, 5.26f)
                curveToRelative(-0.31f, -0.27f, -0.52f, -0.75f, -0.52f, -1.26f)
                reflectiveCurveToRelative(0.21f, -0.98f, 0.59f, -1.32f)
                lineTo(3.01f, 0.08f)
                lineToRelative(1.46f, 1.36f)
                lineToRelative(-1.45f, 1.56f)
                horizontalLineToRelative(17.96f)
                lineToRelative(-1.46f, -1.56f)
                lineToRelative(1.46f, -1.36f)
                lineToRelative(2.49f, 2.67f)
                curveToRelative(0.31f, 0.27f, 0.52f, 0.75f, 0.52f, 1.25f)
                reflectiveCurveToRelative(-0.21f, 0.98f, -0.59f, 1.32f)
                lineToRelative(-2.5f, 2.68f)
                lineToRelative(-1.46f, -1.36f)
                lineToRelative(1.53f, -1.64f)
                lineTo(3.02f, 5.0f)
                lineToRelative(1.5f, 1.61f)
                lineToRelative(-1.46f, 1.36f)
                lineTo(0.52f, 5.26f)
                close()
                moveTo(20f, 15f)
                verticalLineToRelative(3f)
                lineTo(4f, 18f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(0f, 13f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(15.96f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.04f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
                moveTo(18f, 16f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.46f, 0.79f, -2.72f, 1.96f, -3.42f)
                curveToRelative(-0.22f, -2.16f, -2.09f, -3.58f, -3.96f, -3.58f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.06f, 0f, -3.74f, 1.57f, -3.96f, 3.58f)
                curveToRelative(1.17f, 0.7f, 1.96f, 1.96f, 1.96f, 3.42f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(12f)
                close()
            }
        }.also { _SofaSize = it}
