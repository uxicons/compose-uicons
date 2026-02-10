package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bank: ImageVector? = null

val Icons.Tr.Bank: ImageVector
    get() = _Bank ?: UXIcon(name = "Bank") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(0.5f, 24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(23f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(0.24f, 7.78f)
                curveToRelative(-0.36f, -0.69f, -0.32f, -1.48f, 0.13f, -2.12f)
                curveToRelative(0.41f, -0.59f, 1.95f, -1.39f, 1.95f, -1.39f)
                lineTo(9.77f, 0.54f)
                curveToRelative(1.4f, -0.73f, 3.07f, -0.73f, 4.48f, 0.0f)
                lineToRelative(7.65f, 3.88f)
                lineToRelative(0.01f, 0.0f)
                reflectiveCurveToRelative(1.35f, 0.69f, 1.74f, 1.23f)
                curveToRelative(0.44f, 0.63f, 0.49f, 1.43f, 0.12f, 2.12f)
                curveToRelative(-0.4f, 0.75f, -1.18f, 1.22f, -2.04f, 1.22f)
                horizontalLineToRelative(-0.71f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(1.5f, 20.0f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-0.71f)
                curveToRelative(-0.87f, 0f, -1.65f, -0.47f, -2.04f, -1.22f)
                close()
                moveTo(4f, 19f)
                horizontalLineToRelative(4.0f)
                lineToRelative(0.04f, -10f)
                horizontalLineToRelative(-4.04f)
                verticalLineToRelative(10f)
                close()
                moveTo(9.04f, 9f)
                lineToRelative(-0.04f, 10f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-5.96f)
                close()
                moveTo(20f, 9f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-10f)
                close()
                moveTo(1.13f, 7.32f)
                curveToRelative(0.22f, 0.42f, 0.66f, 0.69f, 1.16f, 0.69f)
                horizontalLineToRelative(19.43f)
                curveToRelative(0.49f, 0f, 0.94f, -0.26f, 1.16f, -0.69f)
                curveToRelative(0.19f, -0.36f, 0.17f, -0.76f, -0.06f, -1.08f)
                curveToRelative(-0.23f, -0.34f, -0.69f, -0.57f, -1.14f, -0.79f)
                lineTo(13.79f, 1.44f)
                curveToRelative(-0.56f, -0.29f, -1.17f, -0.44f, -1.79f, -0.44f)
                reflectiveCurveToRelative(-1.22f, 0.14f, -1.78f, 0.43f)
                lineToRelative(-7.46f, 3.73f)
                curveToRelative(-0.56f, 0.29f, -1.3f, 0.68f, -1.57f, 1.07f)
                curveToRelative(-0.23f, 0.33f, -0.25f, 0.72f, -0.06f, 1.08f)
                close()
            }
        }.also { _Bank = it}
