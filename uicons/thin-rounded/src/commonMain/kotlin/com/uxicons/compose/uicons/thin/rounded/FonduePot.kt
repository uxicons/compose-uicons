package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FonduePot: ImageVector? = null

val Icons.Tr.FonduePot: ImageVector
    get() = _FonduePot ?: UXIcon(name = "FonduePot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 8f)
                horizontalLineToRelative(-5.14f)
                lineToRelative(3.57f, -6.25f)
                curveToRelative(0.14f, -0.24f, 0.05f, -0.55f, -0.19f, -0.68f)
                curveToRelative(-0.24f, -0.14f, -0.55f, -0.06f, -0.68f, 0.19f)
                lineToRelative(-3.86f, 6.75f)
                horizontalLineToRelative(-3.62f)
                lineToRelative(1.4f, -7.41f)
                curveToRelative(0.05f, -0.27f, -0.13f, -0.53f, -0.4f, -0.58f)
                curveToRelative(-0.27f, -0.05f, -0.53f, 0.13f, -0.58f, 0.4f)
                lineToRelative(-1.44f, 7.59f)
                horizontalLineToRelative(-5.78f)
                lineTo(2.93f, 1.25f)
                curveToRelative(-0.14f, -0.24f, -0.44f, -0.33f, -0.68f, -0.19f)
                curveToRelative(-0.24f, 0.14f, -0.32f, 0.44f, -0.19f, 0.68f)
                lineToRelative(3.57f, 6.25f)
                lineTo(0.5f, 8f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 3.84f, 2.29f, 7.14f, 5.57f, 8.64f)
                curveToRelative(-1.48f, 0.41f, -2.57f, 1.75f, -2.57f, 3.36f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -1.61f, -1.09f, -2.95f, -2.57f, -3.36f)
                curveToRelative(3.28f, -1.5f, 5.57f, -4.8f, 5.57f, -8.64f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(21f, 11.5f)
                curveToRelative(0f, 4.69f, -3.81f, 8.5f, -8.5f, 8.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-4.52f, 0f, -8.21f, -3.55f, -8.47f, -8f)
                horizontalLineToRelative(15.47f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3f, 11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _FonduePot = it}
