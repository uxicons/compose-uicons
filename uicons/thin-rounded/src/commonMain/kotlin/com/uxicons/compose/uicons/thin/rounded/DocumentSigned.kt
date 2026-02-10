package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentSigned: ImageVector? = null

val Icons.Tr.DocumentSigned: ImageVector
    get() = _DocumentSigned ?: UXIcon(name = "DocumentSigned") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 11.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(6.5f, 12f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(17.5f, 15f)
                lineTo(6.5f, 15f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(17.09f, 18.22f)
                curveToRelative(-0.04f, 0.05f, -0.89f, 1.28f, -2.58f, 1.28f)
                curveToRelative(-1.0f, 0f, -1.58f, -0.32f, -2.25f, -0.69f)
                curveToRelative(-0.7f, -0.38f, -1.44f, -0.81f, -2.75f, -0.81f)
                curveToRelative(-2.12f, 0.01f, -3.35f, 1.63f, -3.4f, 1.7f)
                curveToRelative(-0.16f, 0.22f, -0.12f, 0.53f, 0.1f, 0.7f)
                curveToRelative(0.22f, 0.17f, 0.53f, 0.12f, 0.7f, -0.1f)
                curveToRelative(0.01f, -0.01f, 0.99f, -1.29f, 2.6f, -1.3f)
                curveToRelative(0.99f, -0.03f, 1.59f, 0.32f, 2.26f, 0.69f)
                curveToRelative(0.69f, 0.38f, 1.48f, 0.81f, 2.74f, 0.81f)
                curveToRelative(2.24f, 0f, 3.37f, -1.65f, 3.42f, -1.72f)
                curveToRelative(0.15f, -0.23f, 0.09f, -0.54f, -0.14f, -0.69f)
                curveToRelative(-0.23f, -0.15f, -0.54f, -0.1f, -0.69f, 0.13f)
                close()
                moveTo(22f, 9.99f)
                verticalLineToRelative(9.52f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(6.5f, 24.0f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(2f, 4.5f)
                curveTo(2f, 2.02f, 4.02f, 0f, 6.5f, 0f)
                horizontalLineToRelative(5.51f)
                curveToRelative(1.74f, 0f, 3.37f, 0.68f, 4.6f, 1.9f)
                lineToRelative(3.48f, 3.48f)
                curveToRelative(1.23f, 1.23f, 1.9f, 2.86f, 1.9f, 4.6f)
                close()
                moveTo(15.9f, 2.61f)
                curveToRelative(-0.55f, -0.55f, -1.2f, -0.96f, -1.9f, -1.23f)
                verticalLineToRelative(5.12f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(5.12f)
                curveToRelative(-0.27f, -0.7f, -0.68f, -1.35f, -1.23f, -1.9f)
                lineToRelative(-3.48f, -3.48f)
                close()
                moveTo(21f, 9.99f)
                curveToRelative(0f, -0.34f, -0.04f, -0.66f, -0.1f, -0.98f)
                horizontalLineToRelative(-5.4f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(13f, 1.1f)
                curveToRelative(-0.32f, -0.06f, -0.65f, -0.1f, -0.98f, -0.1f)
                horizontalLineToRelative(-5.51f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-9.52f)
                close()
            }
        }.also { _DocumentSigned = it}
